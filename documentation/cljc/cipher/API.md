
### cipher.api

Functional documentation of the cipher.api isomorphic namespace

---

##### [README](../../../README.md) > [DOCUMENTATION](../../COVER.md) > cipher.api

### Index

- [decrypt](#decrypt)

- [encrypt](#encrypt)

---

### decrypt

```
@description
https://en.wikipedia.org/wiki/Cipher
```

```
@param (*) n
@param (*) key
```

```
@usage
(decrypt "¸ÆßßæéÓâÍ×" "password")
```

```
@example
(decrypt "¸ÆßßæéÓâÍ×" "password")
=>
"Hello world!"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn decrypt
  [n key]
  (let [key-length (count key)
        key-codes  (vec (map int key))
        n-codes    (vec (map int n))]
       (letfn [(f [result n-cursor n-code]
                  (let [key-cursor       (- n-cursor (* key-length (quot n-cursor key-length)))
                        key-code         (nth key-codes key-cursor)
                        shifted-key-code (- n-code key-code)
                        output-key-code  (utils/normalize-key-code shifted-key-code)]
                       (str result (char output-key-code))))]
              (reduce-kv f "" n-codes))))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [cipher.api :refer [decrypt]]))

(cipher.api/decrypt ...)
(decrypt            ...)
```

</details>

---

### encrypt

```
@description
https://en.wikipedia.org/wiki/Cipher
```

```
@param (*) n
@param (*) key
```

```
@usage
(encrypt "Hello world!" "password")
```

```
@example
(encrypt "Hello world!" "password")
=>
"¸ÆßßæéÓâÍ×"
```

```
@return (string)
```

<details>
<summary>Source code</summary>

```
(defn encrypt
  [n key]
  (let [key-length (count key)
        key-codes  (vec (map int key))
        n-codes    (vec (map int n))]
       (letfn [(f [result n-cursor n-code]
                  (let [key-cursor       (- n-cursor (* key-length (quot n-cursor key-length)))
                        key-code         (nth key-codes key-cursor)
                        shifted-key-code (+ n-code key-code)
                        output-key-code  (utils/normalize-key-code shifted-key-code)]
                       (str result (char output-key-code))))]
              (reduce-kv f "" n-codes))))
```

</details>

<details>
<summary>Require</summary>

```
(ns my-namespace (:require [cipher.api :refer [encrypt]]))

(cipher.api/encrypt ...)
(encrypt            ...)
```

</details>

---

<sub>This documentation is generated with the [clj-docs-generator](https://github.com/bithandshake/clj-docs-generator) engine.</sub>

