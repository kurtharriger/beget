(ns beget.templates
  (:use [hiccup.core :only [html]]
        [hiccup.page-helpers :only [include-css]]))

(defn layout [title content]
  (html
   [:html 
    [:head
     (include-css "/blueprint/screen.css")
     [:title title]]
    [:body
     [:div.container
      [:h1 [:a {:href "/"} title]]
      content]]]))

(def index
     (layout "Beget" [:p "A sample Google App Engine project written in Clojure."]))
