package X;

import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.facebook.rti.push.service.FbnsServiceDelegate;
import java.util.ArrayList;

/* renamed from: X.0tY  reason: invalid class name and case insensitive filesystem */
public final class C16680tY extends ArrayList<SubscribeTopic> {
    public C16680tY() {
        add(new SubscribeTopic("/fbns_reg_resp", 1));
        addAll(FbnsServiceDelegate.A0C);
    }
}
