package X;

import java.util.Comparator;
import java.util.Map;

/* renamed from: X.83e  reason: invalid class name and case insensitive filesystem */
public final class C1365583e implements Comparator {
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        return (C18190wL.A08(((Map.Entry) obj2).getValue()) > C18190wL.A08(((Map.Entry) obj).getValue()) ? 1 : (C18190wL.A08(((Map.Entry) obj2).getValue()) == C18190wL.A08(((Map.Entry) obj).getValue()) ? 0 : -1));
    }
}
