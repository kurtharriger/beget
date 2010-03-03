(ns beget
  (:gen-class :extends javax.servlet.http.HttpServlet)
  (:use [beget.response :only [success]]
        [beget.templates :only [index]]
        [compojure :only [defroutes GET]]
        [hiccup :only [html]]
        [ring.util.servlet :only [defservice]]))

(defroutes app
  (GET "/*" req (success index)))

(defservice app)