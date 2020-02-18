class CarAtributes {
  String color;
  String model;
  double actualVelocity;
  double maxVelocity;
  Motor motor;

  void LigaCar() {
    System.out.println("Carro ligado");
  }

  void aceleraCar(double velocityPerKm) {
    double newVelocityVeichle = this.actualVelocity + velocityPerKm;
    this.actualVelocity = newVelocityVeichle;
  }

  int resolveMarcha() {
    if (this.actualVelocity < 0) {
      return -1;
    } else if (this.actualVelocity >= 0 && this.actualVelocity < 40) {
      return 1;
    } else if (this.actualVelocity >= 40 && this.actualVelocity < 80) {
      return 2;
    }
    return 3;
  }
}


class Motor {
  String tipo;
  double potencia;
}


public class Carro {
  public static void main(String[] args) {

    CarAtributes myCar;
    myCar = new CarAtributes();

    Motor motorCar;
    motorCar = new Motor();

    motorCar.potencia = 1.6;
    motorCar.tipo = "Tesla";

    myCar.motor.potencia = 2.0;
    myCar.motor.tipo = "McLarem";
    
    myCar.color = "Green";
    myCar.maxVelocity = 300;
    myCar.model = "Tesla S";
    myCar.actualVelocity = 30;

    myCar.LigaCar();

    myCar.aceleraCar(20);

    double posAcelerationVelocity = myCar.actualVelocity;
    System.out.println(posAcelerationVelocity);
  }
}
