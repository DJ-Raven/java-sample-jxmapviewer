package waypoint;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import org.jxmapviewer.viewer.DefaultWaypoint;
import org.jxmapviewer.viewer.GeoPosition;

public class MyWaypoint extends DefaultWaypoint {

    public PointType getPointType() {
        return pointType;
    }

    public void setPointType(PointType pointType) {
        this.pointType = pointType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JButton getButton() {
        return button;
    }

    public void setButton(JButton button) {
        this.button = button;
    }

    public MyWaypoint(String name, PointType pointType, EventWaypoint event, GeoPosition coord) {
        super(coord);
        this.name = name;
        this.pointType = pointType;
        initButton(event);
    }

    public MyWaypoint() {
    }

    private String name;
    private JButton button;
    private PointType pointType;

    private void initButton(EventWaypoint event) {
        button = new ButtonWaypoint();
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.selected(MyWaypoint.this);
            }
        });
    }

    public static enum PointType {
        START, END
    }
}
