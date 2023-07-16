package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.0QZ  reason: invalid class name */
public final class AnonymousClass0QZ extends C02530Bu {
    public final C03290Fg A00 = new C03290Fg();

    public final void A00(C02530Bu r7) {
        C03290Fg r5 = this.A00;
        synchronized (r5) {
            if (r5.A00 > 0) {
                ArrayList arrayList = r5.A01;
                int size = arrayList.size();
                ArrayList arrayList2 = new ArrayList(size + 1);
                r5.A01 = arrayList2;
                r5.A02 = Collections.unmodifiableList(arrayList2);
                for (int i = 0; i < size; i++) {
                    r5.A01.add(arrayList.get(i));
                }
            }
            r5.A01.add(r7);
        }
    }

    public final void onEventReceivedWithParamsCollectionMap(AnonymousClass0KD r6, AnonymousClass0CU r7) {
        List list;
        C03290Fg r4 = this.A00;
        synchronized (r4) {
            list = r4.A02;
            r4.A00++;
        }
        int i = 0;
        try {
            int size = list.size();
            while (i < size) {
                C02530Bu r0 = (C02530Bu) list.get(i);
                if (r0 != null) {
                    r0.onEventReceivedWithParamsCollectionMap(r6, r7);
                    i++;
                } else {
                    throw new NullPointerException("onEventReceived");
                }
            }
        } finally {
            r4.A00();
        }
    }

    public final void onEventsWritten(int i) {
        List list;
        C03290Fg r4 = this.A00;
        synchronized (r4) {
            list = r4.A02;
            r4.A00++;
        }
        try {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((C02530Bu) list.get(i2)).onEventsWritten(i);
            }
        } finally {
            r4.A00();
        }
    }
}
