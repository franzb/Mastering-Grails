package trip.planner

class Airline {
    static constraints = {
        name(blank:false, maxSize:100)
        motto()
        url(url:true)
        frequentFlyer(blank:true)
        notes(maxSize:1500)
    }

    static hasMany = [trips:Trip]

    String name
    String motto
    String url
    String frequentFlyer
    String notes

    String toString() {
        name
    }
}
