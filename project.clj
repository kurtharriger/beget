(defproject beget "0.1.0-SNAPSHOT"
  :dependencies [[compojure "0.6.0"]
                 [hiccup "0.3.4"]
                 [org.clojure/clojure "1.2.0"]
                 [org.clojure/clojure-contrib "1.2.0"]
                 [ring "0.3.5"]
                 [com.google.appengine/appengine-tools-sdk "1.3.0"]]
  :dev-dependencies [[swank-clojure "1.2.1"]]
  :aot [beget]
  :compile-path "war/WEB-INF/classes/"
  :library-path "war/WEB-INF/lib/")
