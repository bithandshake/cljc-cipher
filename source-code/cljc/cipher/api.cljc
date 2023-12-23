
(ns cipher.api
    (:require [cipher.core :as core]))

;; ----------------------------------------------------------------------------
;; ----------------------------------------------------------------------------

; @tutorial How to encrypt a string?
;
; The [cipher.api/encrypt!](#encrypt) function encrypts the given string using the given passkey.
;
; @code
; (encrypt! "My text" "My passkey")
; =>
; "r@dFkg"

; @tutorial How to decrypt a string?
;
; The [cipher.api/decrypt!](#decrypt) function decrypts the given string using the given passkey.
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
