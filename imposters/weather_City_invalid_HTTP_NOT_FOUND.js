(request, state, logger) => {
    return {
        statusCode: 404, headers: {'Content-Type': 'application/json;charset=UTF-8'}, body: {
            "cod": "404",
            "message": "city not found"
        }
    }
}