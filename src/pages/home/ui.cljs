(ns pages.home.ui
  (:require
   [subs :as subs]
   [re-frame.core :as re-frame]
   [ui.header :refer [Header]]))

(defn home-panel []
  [:div.home
   [Header]
   [:h1 " Home Page."]])
