(request, state, logger) => {
    return {
        statusCode: 200, headers: {'Content-Type': 'application/json;charset=UTF-8'}, body: {
            "coord": {
                "lon": -120.5015, "lat": 47.5001
            }, "weather": [{
                "id": 804, "main": "Clouds", "description": "overcast clouds", "icon": "04n"
            }], "base": "stations", "main": {
                "temp": 273.18,
                "feels_like": 273.18,
                "temp_min": 272.37,
                "temp_max": 277.73,
                "pressure": 1011,
                "humidity": 90,
                "sea_level": 1011,
                "grnd_level": 951
            }, "visibility": 10000, "wind": {
                "speed": 0.32, "deg": 192, "gust": 0.62
            }, "clouds": {
                "all": 99
            }, "dt": 1637669383, "sys": {
                "type": 2, "id": 2019804, "country": "US", "sunrise": 1637680744, "sunset": 1637713102
            }, "timezone": -28800, "id": 5815135, "name": "Washington", "cod": 200
        }
    }
}