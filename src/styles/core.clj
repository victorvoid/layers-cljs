(ns styles.core
  (:require [garden.def :refer [defstyles]]
            [normalize.core :refer [normalize]]))

(defstyles app
  normalize
  [:*
   {:box-sizing :border-box
    :margin 0
    :padding 0}])
