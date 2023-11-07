
# cljc-cipher

### Overview

The <strong>cljc-cipher</strong> is a simple Clojure/ClojureScript cipher encryption library.

[https://en.wikipedia.org/wiki/Cipher](https://en.wikipedia.org/wiki/Cipher)

### deps.edn

```
{:deps {bithandshake/cljc-cipher {:git/url "https://github.com/bithandshake/cljc-cipher"
                                  :sha     "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx"}}
```

### Current version

Check out the latest commit on the [release branch](https://github.com/bithandshake/cljc-cipher/tree/release).

### Documentation

The <strong>cljc-cipher</strong> functional documentation is [available here](documentation/COVER.md).

### Changelog

You can track the changes of the <strong>cljc-cipher</strong> library [here](CHANGES.md).

# Usage

> Some parameters of the following functions and some further functions are not discussed in this file.
  To learn more about the available functionality, check out the [functional documentation](documentation/COVER.md)!

### Index

- [How to encrypt a text?](#how-to-encrypt-a-text)

- [How to decrypt a text?](#how-to-decrypt-a-text)

### How to encrypt a text?

The [`cipher.api/encrypt!`](documentation/cljc/cipher/API.md/#encrypt)
function encrypts the given text using the given passkey.

```
(encrypt! "My text" "My passkey")
; =>
; "r@dFkg"
```

### How to decrypt a text?

The [`cipher.api/encrypt!`](documentation/cljc/cipher/API.md/#encrypt)
function encrypts the given text using the given passkey.

```
(decrypt! "r@dFkg" "My passkey")
; =>
; "My text"
```
