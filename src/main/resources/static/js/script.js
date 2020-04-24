new App();

$(function () {
    $('.tlt').textillate();
   // $('#description h3').textillate();
})

function initMap() {
    // The location of Uluru
    var uluru = {lat: -17.396828, lng: -66.194477};
    // The map, centered at Uluru
    var map = new google.maps.Map(document.getElementById('map'), {zoom: 18, center: uluru});
    // The marker, positioned at Uluru
    var marker = new google.maps.Marker({position: uluru, map: map});
}
//initMap();
