package hu.bme.mit.train.tachograph;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import hu.bme.mit.train.controller.TrainControllerImpl;
import hu.bme.mit.train.interfaces.TrainController;
import hu.bme.mit.train.interfaces.TrainSensor;
import hu.bme.mit.train.interfaces.TrainUser;
import hu.bme.mit.train.sensor.TrainSensorImpl;
import hu.bme.mit.train.user.TrainUserImpl;

import java.util.Date;

public class TrainTachograph {
    private TrainController controller = new TrainControllerImpl();

    public Table<Date, Integer, Integer> getTachographTable() {
        return tachographTable;
    }

    Table<Date, Integer, Integer> tachographTable
            = HashBasedTable.create();

    public TrainTachograph() {
        this.controller.getReferenceSpeed();
        this.tachographTable.put(new Date(), 4, 5);
    }




}
