class Jaeger {
    private String modelName;
    private String mark;
    private String origin;
    private float height;
    private float weight;
    private int strenght;
    private int armor;
    private int currentSpeed;
    private int minSpeed;
    private int maxSpeed;
    private String launchDate;
    private String bodyLanguage;
    private String weapon;
    private int kaijuKilled;

    // Конструкторы
    public Jaeger() {
    }

    public Jaeger(String modelName, String mark, String origin, float height, 
            float weight, int strenght, int armor, int maxSpeed, 
            String launchDate, String bodyLanguage, String weapon, int kaijuKilled) {
        this.modelName = modelName;
        this.mark = mark;
        this.origin = origin;
        this.height = height;
        this.weight = weight;
        this.strenght = strenght;
        this.armor = armor;
        this.maxSpeed = maxSpeed;
        this.launchDate = launchDate;
        this.bodyLanguage = bodyLanguage;
        this.weapon = weapon;
        this.kaijuKilled = kaijuKilled;
    }

    // Сеттеры/геттеры
    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getMark() {
        return mark;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getOrigin() {
        return origin;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getHeight() {
        return height;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public float getWeight() {
        return weight;
    }

    public void setStrenght(int strenght) {
        this.strenght = strenght;
    }

    public int getStrenght() {
        return strenght;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setLaunchDate(String launchDate) {
        this.launchDate = launchDate;
    }

    public String getLaunchDate() {
        return launchDate;
    }

    public void setBodyLanguage(String bodyLanguage) {
        this.bodyLanguage = bodyLanguage;
    }

    public String getBodyLanguage() {
        return bodyLanguage;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setKaijuKilled(int kaijuKilled) {
        this.kaijuKilled = kaijuKilled;
    }

    public int getKaijuKilled() {
        return kaijuKilled;
    }

    // Дейсвтия роботов
    public boolean drift() {
        System.out.println("Drift activated");
        return true;
    }

    public String scanKaiju() {
        return modelName + " is scanning";
    }

    public void activateWeapon() {
        System.out.println(modelName + " activated " + weapon);
    }

    public void deactivateWeapon() {
        System.out.println(modelName + " deactivated " + weapon);
    }

    public String useWeapon() {
        return modelName + " uses " + weapon;
    }

    public void startMove() {
    System.out.println(modelName + " is moving");
    currentSpeed = 1;
    System.out.println("Current speed is " + currentSpeed);
    }

    public void stopMove() {
    System.out.println(modelName + " is stoping");
    currentSpeed = minSpeed;
    }

    public void speedUp(int speed) {
        if (currentSpeed + speed > maxSpeed) {
            System.out.println("Maximum speed is " + maxSpeed);
        } else {
            currentSpeed += speed;
        }
    }

    public void speedDown(int speed) {
        if (currentSpeed - speed < minSpeed) {
            System.out.println("Minimum speed is " + minSpeed);
        } else {
            System.out.println(modelName + " reduced speed by " + speed);
            currentSpeed -= speed;
        }
    }

    public void forceMaxSpeed() {
        System.out.println(modelName + " forced speed!");
        currentSpeed = maxSpeed;
    }

    public void killKaiju() {
        System.out.println("Kaiju was killed!");
        kaijuKilled++;
    }

    public String getInfo() {
        return "Model: " + modelName + 
                "\nMark: " + mark + 
                "\nOrigin: " + origin + 
                "\nLaunch Date: " + launchDate + 
                "\nBody Language: " + bodyLanguage + 
                "\nWeapon: " + weapon + 
                "\nKaiju Killed: " + kaijuKilled + 
                "\nHeight, m: " + height + 
                "\nWeight, t: " + weight + 
                "\nStrenght: " + strenght + 
                "\nArmor: " + armor + 
                "\nMaximum speed: " + maxSpeed;
    }
}