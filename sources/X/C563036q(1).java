package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.contacts.ccu.impl.CCUPluginImpl;

/* renamed from: X.36q  reason: invalid class name and case insensitive filesystem */
public final class C563036q {
    public static C563036q A01;
    public CCUPluginImpl A00;

    public C563036q() {
        try {
            this.A00 = (CCUPluginImpl) Class.forName("com.instagram.contacts.ccu.impl.CCUPluginImpl").getConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Throwable th) {
            C10450iM.A06("CCUPluginWrapper", StringFormatUtil.formatStrLocaleSafe("Failed to initialize CCUPlugin"), th);
        }
    }
}
