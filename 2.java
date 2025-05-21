class Vehicle{
    private String licencePlate;
    private String ownerName;
    private int hourseParked;

    Vehicle(String lp,String on,int hp){
        licencePlate = lp;
        ownerName = on;
        hourseParked = hp;
    }

    public String getLicencePlate(){
        return licencePlate;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public int gethourseParked(){
        return hourseParked;
    }

    public void setLicencePlate(String licencePlate){
        this.licencePlate = licencePlate;
    }

    public void setOwnerName(String ownerName){
        this.ownerName = ownerName;
    }

    public void setHourseParked(int hourseParked){
        this.hourseParked = hourseParked;
    }

}

class ParkingLot{
    int parkLimit = 0;
    String parkedCarsLp[] = new String[6];
    String parkedOwner[] = new String[6];
    int parkedHours[] = new int[6];

    public void addVehicles(String lp,String owner,int hours){
         if(parkLimit <= 4){
            parkedCarsLp[parkLimit] = lp;
            parkedOwner[parkLimit] = owner;
            parkedHours[parkLimit] = hours;
            parkLimit++;
        } else {
            System.out.println("Can't add "+lp+"...! Park is full please remove a vehicle\n");
        }
    }

    public void rmVehicles(String licencePlate){
       for(int i = 0; i <= parkLimit;i++){
            if(parkedCarsLp[i] == licencePlate){

                System.out.println("licence Plate " + licencePlate + " Was Removed");
                    parkedCarsLp[i] = null;
                    parkedOwner[i] = null;
                    parkedHours[i] = 0;

                for(int k = i;k <= parkLimit - 1;k++){
                    parkedCarsLp[k] = parkedCarsLp[k + 1];
                    parkedOwner[k] = parkedOwner[k + 1];
                    parkedHours[k] = parkedHours[k + 1];
                }   
                break;
            }
           parkLimit--;  
       }
    }

    public void printVehicles(String licenceP){
        for(int i = 0;i < parkLimit;i++){
            if(licenceP == parkedCarsLp[i]){
                System.out.println("Licence Plate: " + parkedCarsLp[i]);
                System.out.println("Owner: " + parkedOwner[i]);
                System.out.println("Parked For " + parkedHours[i] + " Hours");
                break;
            }
        }
    }

    public void printAllVehicle(){
        for(int i = 0; i <= parkLimit; i++){
            if(parkedCarsLp[i] != null){
                    System.out.println("Licence Plate: " + parkedCarsLp[i]);
                    System.out.println("Owner: " + parkedOwner[i]);
                    System.out.println("Parked For " + parkedHours[i] + " Hours");
                    System.out.println();
            }
        }
    }

}

class Problem02 {
    public static void main(String[] args){
        Vehicle v01 = new Vehicle("ABC123","John Doe",2);
        Vehicle v02 = new Vehicle("XYZ789","Jane Smith",5);
        Vehicle v03 = new Vehicle("LMN556","Bob Brown",1);



        ParkingLot p01 = new ParkingLot();

        p01.addVehicles(v01.getLicencePlate(),v01.getOwnerName(),v01.gethourseParked());
        p01.addVehicles(v02.getLicencePlate(),v02.getOwnerName(),v02.gethourseParked());
        p01.addVehicles(v03.getLicencePlate(),v03.getOwnerName(),v03.gethourseParked());

        
        p01.rmVehicles("ABC123");


        p01.printAllVehicle();

    }


}