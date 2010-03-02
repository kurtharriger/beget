(ns beget
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use [compojure :only [defroutes GET]]
        [hiccup :only [html]]
        [ring.util.servlet :only [defservice]]))

(defn success [body]
  {:status 200 :headers {} :body body})

(defroutes app
  (GET "/*" req (success (html [:h1 "Hello World!"]))))

(defservice app)