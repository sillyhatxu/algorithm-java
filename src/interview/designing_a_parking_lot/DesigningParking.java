package interview.designing_a_parking_lot;

/**
 * Description:
 * <p>
 * Given a parking lot containing multiple levels and each level containing multiple rows and each row in turn containing multiple spots. The questions is to determine if there are enough spots to check if a vehicle can be parked.
 * <p>
 * Which object is responsible to determine if there is enough spots, I mean its the parking lot object which is supposed to receive the first query but ultimately it should be either level or row to implement the actual algorithm, right?
 * <p>
 * Its not about a single class but system as a whole.
 * <p>
 * Requirement:
 * <p>
 * The parking lot has multiple levels. Each level has multiple rows of spots.
 * <p>
 * The parking lot can park motorcycles, cars, and buses.
 * <p>
 * The parking lot has motorcycle spots, compact spots, and large spots.
 * <p>
 * A motorcycle can park in any spot.
 * <p>
 * A car can park in either a single compact spot or a single large spot.
 * <p>
 * A bus can park in five large spots that are consecutive and within the same row. It cannot park in small spots.
 * <p>
 * The question is that the given system should be able to given answer to the queries like:
 * <p>
 * Given a car the system should be able to tell if there is a spot for car or not, if yes the answer should be something like:
 * <p>
 * There is a spot on level x row y and spot z
 * The issues I face while solving such problems is where to start and how to find correct objects which should represent the domain correctly.
 */

/*
I don't know this answer what's meaning. I think if a motorcycle comes here. The system should be able to tell it -> B25.
Example:
Motorcycle : B25
Car : C32
Bus : A12 (This is a bus parking space)
Bus : C12 - C16(This is a car parking space, so the bus need five parking space)
 */
public class DesigningParking {


    public static void main(String[] args) {

    }
}