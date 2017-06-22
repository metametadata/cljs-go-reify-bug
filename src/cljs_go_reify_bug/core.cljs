(ns cljs-go-reify-bug.core
  (:require [cljs.core.async :as async])
  (:require-macros [cljs.core.async.macros :refer [go]]))

(println "Hello world!")

(defprotocol Foo)
(go
  (reify Foo)
  123)