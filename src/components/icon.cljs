(ns ui.icon)

(defn Icon [name]
  [:svg {:class name} [:use {:xlinkHref (str "#" name)}]])
