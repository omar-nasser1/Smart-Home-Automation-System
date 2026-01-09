public class SmartHomeSystem {

    public static void main(String[] args) {
      
        
        
         
        Device d1 = new Light("L1", "Living Room Light", "Living Room", 70, "Warm White");
        Device d2 = new Fan("F1", "Bedroom Fan", "Bedroom", 2, true);
        Device d3 = new Thermostat("T1", "Main Thermostat", 27.5, 24.0, "COOL");

        Device[] devices = { d1, d2, d3 };

        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== Smart Home Automation System ===");
            System.out.println("1. Show all device status");
            System.out.println("2. Turn ON all devices");
            System.out.println("3. Turn OFF all devices");
            System.out.println("4. Control single device");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    
                    for (Device device : devices) {
                        device.showStatus();
                        System.out.println();
                    }
                    break;

                case 2:
                    for (Device device : devices) {
                        device.turnOn(); 
                    }
                    break;

                case 3:
                    for (Device device : devices) {
                        device.turnOff();
                    }
                    break;

                case 4:
                    System.out.println("Select device:");
                    for (int i = 0; i < devices.length; i++) {
                        System.out.println((i + 1) + ". " + devices[i].getName());
                    }
                    System.out.print("Enter number: ");
                    int dIndex = sc.nextInt() - 1;

                    if (dIndex < 0 || dIndex >= devices.length) {
                        System.out.println("Invalid device.");
                        break;
                    }

                    Device selected = devices[dIndex];
                    System.out.println("1. Turn ON");
                    System.out.println("2. Turn OFF");
                    System.out.print("Enter action: ");
                    int action = sc.nextInt();

                    if (action == 1) selected.turnOn();
                    else if (action == 2) selected.turnOff();
                    else System.out.println("Invalid action.");

                    break;

                case 0:
                    System.out.println("Exiting system...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
    }

