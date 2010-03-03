(ns beget.response)

(defn success [body]
  {:status 200 :headers {} :body body})
