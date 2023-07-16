package X;

import com.facebook.dcp.model.ExampleContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.FeatureMetadata;
import com.facebook.dcp.model.Type;
import com.facebook.dcp.signals.model.SignalResult;
import com.facebook.kotlin.compilerplugins.dataclassgenerate.superclass.KtCSuperShape0S2200000_I2;
import java.util.List;
import java.util.Map;

/* renamed from: X.7e4  reason: invalid class name and case insensitive filesystem */
public final class C125807e4 implements C143298gU {
    public final KtCSuperShape0S2200000_I2 A00;

    public final List ALN(ExampleContext exampleContext, FeatureMetadata featureMetadata, Map map) {
        Object obj;
        FeatureData featureData;
        KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I2 = this.A00;
        List list = (List) map.get(ktCSuperShape0S2200000_I2.A03);
        if (list == null) {
            list = AnonymousClass0ZV.A00;
        }
        String str = featureMetadata.A08;
        if (list.isEmpty()) {
            obj = ktCSuperShape0S2200000_I2.A00;
        } else {
            obj = list.get(C86104wH.A0B(list));
        }
        SignalResult signalResult = (SignalResult) obj;
        Type type = (Type) ktCSuperShape0S2200000_I2.A01;
        String str2 = ktCSuperShape0S2200000_I2.A02;
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            featureData = new FeatureData(type, str, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, C86134wK.A0C(C86124wJ.A0j(str2, signalResult.A06)), false);
        } else if (ordinal == 1) {
            Type type2 = Type.DOUBLE;
            int i = (Float) signalResult.A05.get(str2);
            if (i == null) {
                i = 0;
            }
            featureData = new FeatureData(type2, str, (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, C86124wJ.A00(i), 16372, 0, false);
        } else if (ordinal == 2) {
            String A0r = C18220wO.A0r(str2, signalResult.A08);
            if (A0r == null) {
                A0r = "";
            }
            featureData = new FeatureData(type, str, A0r, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16364, 0, false);
        }
        return C18180wK.A0n(featureData);
    }

    public C125807e4(KtCSuperShape0S2200000_I2 ktCSuperShape0S2200000_I2) {
        this.A00 = ktCSuperShape0S2200000_I2;
    }
}
