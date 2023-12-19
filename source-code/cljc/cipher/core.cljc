
(ns cipher.core
    (:require [cipher.utils :as utils]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn encrypt
  ; @param (*) n
  ; @param (*) key
  ;
  ; @description
  ; [https://en.wikipedia.org/wiki/Cipher](https://en.wikipedia.org/wiki/Cipher)
  ;
  ; @usage
  ; (encrypt "Hello world!" "password")
  ; =>
  ; "¸ÆßßæéÓâÍ×"
  ;
  ; @return (string)
  [n key]
  (let [key-length (count key)
        key-codes  (vec (map int key))
        n-codes    (vec (map int n))]
       (letfn [(f0 [result n-cursor n-code]
                   (let [key-cursor       (- n-cursor (* key-length (quot n-cursor key-length)))
                         key-code         (nth key-codes key-cursor)
                         shifted-key-code (+ n-code key-code)
                         output-key-code  (utils/normalize-key-code shifted-key-code)]
                        (str result (char output-key-code))))]
              (reduce-kv f0 "" n-codes))))

(defn decrypt
  ; @param (*) n
  ; @param (*) key
  ;
  ; @description
  ; [https://en.wikipedia.org/wiki/Cipher](https://en.wikipedia.org/wiki/Cipher)
  ;
  ; @usage
  ; (decrypt "¸ÆßßæéÓâÍ×" "password")
  ; =>
  ; "Hello world!"
  ;
  ; @return (string)
  [n key]
  (let [key-length (count key)
        key-codes  (vec (map int key))
        n-codes    (vec (map int n))]
       (letfn [(f0 [result n-cursor n-code]
                   (let [key-cursor       (- n-cursor (* key-length (quot n-cursor key-length)))
                         key-code         (nth key-codes key-cursor)
                         shifted-key-code (- n-code key-code)
                         output-key-code  (utils/normalize-key-code shifted-key-code)]
                        (str result (char output-key-code))))]
              (reduce-kv f0 "" n-codes))))
