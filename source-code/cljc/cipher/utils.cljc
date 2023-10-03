
(ns cipher.utils)

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

(defn normalize-key-code
  ; @ignore
  ;
  ; @param (integer) key-code
  ;
  ; @return (integer)
  [key-code]
  ; The ASCII (7bit) character table contains 128 characters, therefore if a
  ; shifted character key code is not in the normal range (0 - 127) after shifting,
  ; subtracting or adding 128 puts it back to the normal range.
  ;
  ; 112 + 28 = 140            (out of range after shifting)
  ;            140 - 128 = 12 (subtracting 128 normalizes the output)
  ;
  ; 24 - 102 = -78            (out of range after shifting)
  ;            -78 + 128 = 50 (adding 128 normalizes the output)
  (cond (> key-code 127) (- key-code 128)
        (< key-code 0)   (+ key-code 128)
        :return key-code))
