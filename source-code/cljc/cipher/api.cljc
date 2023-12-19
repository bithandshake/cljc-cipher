
(ns cipher.api
    (:require [cipher.core :as core]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial How to encrypt a text?
;
; The [cipher.api/encrypt!](#encrypt) function encrypts the given text using the given passkey.
;
; @code
; (encrypt! "My text" "My passkey")
; =>
; "r@dFkg"

; @tutorial How to decrypt a text?
;
; The [cipher.api/decrypt!](#decrypt) function decrypts the given text using the given passkey.
;
; @code
; (decrypt! "r@dFkg" "My passkey")
; =>
; "My text"

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @redirect (cipher.core/*)
(def encrypt core/encrypt)
(def decrypt core/decrypt)
