package X;

import com.facebookpay.expresscheckout.logging.ComponentLoggingData;
import com.facebookpay.widget.listcell.ListCell;
import com.fbpay.logging.LoggingContext;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.6I7  reason: invalid class name */
public final class AnonymousClass6I7 {
    public static final Map A00(AnonymousClass8e3 r3) {
        LinkedHashMap A0y = C18220wO.A0y();
        ListCell listCell = (ListCell) r3;
        LoggingContext loggingContext = listCell.A0O;
        if (loggingContext != null) {
            C86164wN.A1K(loggingContext, A0y);
            ComponentLoggingData componentLoggingData = listCell.A0J;
            if (componentLoggingData != null) {
                A0y.put("component_logging_data", componentLoggingData);
                return A0y;
            }
            throw C18180wK.A0a("Required value was null.");
        }
        throw C18180wK.A0a("Required value was null.");
    }
}
