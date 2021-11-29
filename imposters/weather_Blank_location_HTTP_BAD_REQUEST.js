(request, state, logger) => {
    return {
        statusCode: 400, headers: {'Content-Type': 'application/json;charset=UTF-8'}, body: {
            "cod": "400",
            "message": "Nothing to geocode"
        }
    }
}