public class Zone {
    String displayName;
    int offset;
    public String getDisplayName() { return displayName; }
    public int getOffset() { return offset; }
}
public class ZoneEastern extends Zone {
    public ZoneEastern() {
        displayName= "US/Eastern";
        offset = -5;
    }
}
public class ZoneCentral extends Zone {
    public ZoneCentral() {
        displayName= "US/Central";
        offset = -6;
    }
}
public class ZoneMountain extends Zone {
    public ZoneMountain() {
        displayName = "US/Mountain";
        offset= -7;
    }
}
public class ZonePacific extends Zone {
    public ZonePacific() {
        displayName = "US/Pacific";
        offset=-8;
    }
}

public class ZoneFactory {
    public Zone createZone(String zoneId) {
        Zone zone;
        if (zoneId == "US/Pacific") {
        zone = new ZonePacific();
        }
        else if (zoneId == "US/Mountain") {
        zone = new ZoneMountain();
        }
        else if (zoneId == "US/Central") {
        zone = new ZoneCentral();
        }
        else if (zoneId == "US/Eastern") {
        zone = new ZoneEastern();
        }
        return zone;
    }
}