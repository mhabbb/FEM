package fem;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class GlobalData {

    private double nH;

    private double nB;

    private double H;

    private double B;

    private double temperatureStart;

    private double time;

    private double deltaTime;

    private double temperature;

    private double alfa;

    private double cw;

    private double k;

    private double density;

    @XmlElement
    public double getnH() {
        return nH;
    }

    public void setnH(double nH) {
        this.nH = nH;
    }

    @XmlElement
    public double getnB() {
        return nB;
    }

    public void setnB(double nB) {
        this.nB = nB;
    }

    @XmlElement
    public double getH() {
        return H;
    }

    public void setH(double h) {
        H = h;
    }

    @XmlElement
    public double getB() {
        return B;
    }

    public void setB(double b) {
        B = b;
    }

    @XmlElement
    public double getTemperatureStart() {
        return temperatureStart;
    }

    public void setTemperatureStart(double temperatureStart) {
        this.temperatureStart = temperatureStart;
    }

    @XmlElement
    public double getTime() {
        return time;
    }

    public void setTime(double time) {
        this.time = time;
    }

    @XmlElement
    public double getDeltaTime() {
        return deltaTime;
    }

    public void setDeltaTime(double deltaTime) {
        this.deltaTime = deltaTime;
    }

    @XmlElement
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @XmlElement
    public double getAlfa() {
        return alfa;
    }

    public void setAlfa(double alfa) {
        this.alfa = alfa;
    }

    @XmlElement
    public double getCw() {
        return cw;
    }

    public void setCw(double cw) {
        this.cw = cw;
    }

    @XmlElement
    public double getK() {
        return k;
    }

    public void setK(double k) {
        this.k = k;
    }

    @XmlElement
    public double getDensity() {
        return density;
    }

    public void setDensity(double density) {
        this.density = density;
    }
}
