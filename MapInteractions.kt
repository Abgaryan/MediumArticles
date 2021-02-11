interface MapInteractions {

    //When the user starts zooming in
    val onMapZoomInStartListener: (Double) -> Unit

    //When the user stops zooming in
    val onMapZoomInEndListener: (zoomLevel: Double) -> Unit

    //When the user starts zooming out
    val onMapZoomOutStartListener: (zoomLevel:Double) -> Unit

    //When the user stops zooming out
    val onMapZoomOutEndListener: (zoomLevel:Double) -> Unit

    val onMapPanListener: () -> Unit
    val onMapRotateListener: () -> Unit
}
