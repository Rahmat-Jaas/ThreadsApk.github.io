package org.webrtc;

import X.AnonymousClass00U;
import X.C18190wL;

public class StatsReport {
    public final String id;
    public final double timestamp;
    public final String type;
    public final Value[] values;

    public class Value {
        public final String name;
        public final String value;

        public String toString() {
            return AnonymousClass00U.A0h("[", this.name, ": ", this.value, "]");
        }

        public Value(String str, String str2) {
            this.name = str;
            this.value = str2;
        }
    }

    public String toString() {
        StringBuilder A0s = C18190wL.A0s("id: ");
        A0s.append(this.id);
        A0s.append(", type: ");
        A0s.append(this.type);
        A0s.append(", timestamp: ");
        A0s.append(this.timestamp);
        A0s.append(", values: ");
        int i = 0;
        while (true) {
            Value[] valueArr = this.values;
            if (i >= valueArr.length) {
                return A0s.toString();
            }
            A0s.append(valueArr[i].toString());
            A0s.append(", ");
            i++;
        }
    }

    public StatsReport(String str, String str2, double d, Value[] valueArr) {
        this.id = str;
        this.type = str2;
        this.timestamp = d;
        this.values = valueArr;
    }
}
