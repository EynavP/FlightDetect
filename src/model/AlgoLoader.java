package model;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import javafx.scene.chart.XYChart.Series;


public class AlgoLoader implements TimeSeriesAnomalyDetector{
	private TimeSeriesAnomalyDetector algo;
	
	public AlgoLoader(String p,String classname) throws MalformedURLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		String path =  "file://" + p;
		URL[] urls = new URL[1];
		urls[0] = new URL(path);
		URLClassLoader classLoader = new URLClassLoader(urls);
		Class<?> classInstance = classLoader.loadClass(classname);
		algo = (TimeSeriesAnomalyDetector)classInstance.newInstance();		
	}

	public TimeSeriesAnomalyDetector getAlgo() {return algo;}

	public void setAlgo(TimeSeriesAnomalyDetector algo) {this.algo = algo;}

	@Override
	public void learnNormal(TimeSeries ts) { algo.learnNormal(ts);}
	
	@Override
	public List<AnomalyReport> detect(TimeSeries ts) { return algo.detect(ts);}

	@Override
	public Series paint(String... strings) { return algo.paint(strings);}

	@Override
	public String getName() {return algo.getName();}

}
