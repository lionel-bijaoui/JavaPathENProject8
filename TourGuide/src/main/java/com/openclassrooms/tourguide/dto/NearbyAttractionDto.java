package com.openclassrooms.tourguide.dto;

import gpsUtil.location.Location;

public record NearbyAttractionDto (
    String attractionName,
    Location attractionLocation,
    Location userLocation,
    double distance,
    int rewardPoints
) {
}
