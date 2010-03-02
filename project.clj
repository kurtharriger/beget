(defproject beget "0.1.0-SNAPSHOT"
  :dependencies [[org.buntin/compojure "0.4.0-SNAPSHOT"]
                 [hiccup "0.4.0-SNAPSHOT"]
                 [org.clojure/clojure "1.1.0"]
                 [org.clojure/clojure-contrib "1.1.0"]
                 [ring "0.1.1-SNAPSHOT"]
                 [com.google.appengine/appengine-tools-sdk "1.3.0"]]
  :dev-dependencies [[swank-clojure "1.1.0"]]
  :namespaces [beget]
  :compile-path "war/WEB-INF/classes/"
  :library-path "war/WEB-INF/lib/")