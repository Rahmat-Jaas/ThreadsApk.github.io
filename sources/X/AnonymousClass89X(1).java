package X;

import com.instagram.maps.ui.IgStaticMapView;
import java.util.HashMap;

/* renamed from: X.89X  reason: invalid class name */
public final class AnonymousClass89X extends HashMap<String, String> {
    public final /* synthetic */ IgStaticMapView A00;

    public AnonymousClass89X(IgStaticMapView igStaticMapView) {
        this.A00 = igStaticMapView;
        put("map_url", igStaticMapView.A05.toString());
        put("surface", igStaticMapView.A0I.A08);
    }
}
