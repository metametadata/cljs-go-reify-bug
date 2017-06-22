(require '[cljs.build.api :as b])

(b/watch "src"
  {:main 'cljs-go-reify-bug.core
   :output-to "out/cljs_go_reify_bug.js"
   :output-dir "out"})
