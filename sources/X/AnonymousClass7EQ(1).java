package X;

import com.facebook.dcp.model.Example;
import com.facebook.dcp.model.ExampleContext;
import com.facebook.dcp.model.FeatureData;
import com.facebook.dcp.model.Type;
import com.facebook.graphql.impls.OnDeviceFLFeaturesResponseImpl;
import com.facebook.pando.TreeJNI;
import com.facebook.react.modules.intent.IntentModule;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.7EQ  reason: invalid class name */
public final class AnonymousClass7EQ {
    public static final ExampleContext A00(OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.Context context) {
        ExampleContext exampleContext = new ExampleContext((Type) null, (String) null, 31);
        if (context != null) {
            C1366783w A0G = C18250wR.A0G(context, OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.Context.IntFeatures.class, "int_features");
            while (A0G.hasNext()) {
                TreeJNI treeJNI = (TreeJNI) A0G.next();
                if (treeJNI.hasFieldValue("id") && treeJNI.hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                    exampleContext.A03.put(C86134wK.A0o(treeJNI), C18230wP.A0f(treeJNI.getIntValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
                }
            }
            C1366783w A0G2 = C18250wR.A0G(context, OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.Context.FloatFeatures.class, "float_features");
            while (A0G2.hasNext()) {
                TreeJNI treeJNI2 = (TreeJNI) A0G2.next();
                if (treeJNI2.hasFieldValue("id") && treeJNI2.hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                    exampleContext.A02.put(C86134wK.A0o(treeJNI2), Double.valueOf(treeJNI2.getDoubleValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)));
                }
            }
            C1366783w A0G3 = C18250wR.A0G(context, OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.Context.StringFeatures.class, "string_features");
            while (A0G3.hasNext()) {
                TreeJNI treeJNI3 = (TreeJNI) A0G3.next();
                String stringValue = treeJNI3.getStringValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                if (treeJNI3.hasFieldValue("id") && stringValue != null) {
                    exampleContext.A04.put(C86134wK.A0o(treeJNI3), stringValue);
                }
            }
        }
        return exampleContext;
    }

    public final AnonymousClass5Id A02(OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures onDeviceFlFeatures) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        C1366783w it = C18230wP.A0P(onDeviceFlFeatures, OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.class, "features").iterator();
        while (it.hasNext()) {
            OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features features = (OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features) it.next();
            String A0X = C18250wR.A0X(features);
            if (A0X == null) {
                return AnonymousClass5Id.A01(AnonymousClass0ZV.A00, "Example ID missing in server feature response", false);
            }
            A0v.add(new Example(A00((OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.Context) features.getTreeValue("context", OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.Context.class)), A0X, A01(features)));
        }
        return AnonymousClass5Id.A00(A0v);
    }

    private final HashMap A01(OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features features) {
        HashMap A0y = AnonymousClass0wJ.A0y();
        OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features features2 = features;
        C1366783w A0G = C18250wR.A0G(features2, OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.IntFeatures.class, "int_features");
        while (A0G.hasNext()) {
            TreeJNI treeJNI = (TreeJNI) A0G.next();
            if (treeJNI.hasFieldValue("id") && treeJNI.hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                A0y.put(C86134wK.A0o(treeJNI), new FeatureData(Type.LONG, C86134wK.A0o(treeJNI), (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16376, (long) treeJNI.getIntValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE), false));
            }
        }
        C1366783w A0G2 = C18250wR.A0G(features2, OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.FloatFeatures.class, "float_features");
        while (A0G2.hasNext()) {
            TreeJNI treeJNI2 = (TreeJNI) A0G2.next();
            if (treeJNI2.hasFieldValue("id") && treeJNI2.hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) {
                A0y.put(C86134wK.A0o(treeJNI2), new FeatureData(Type.DOUBLE, C86134wK.A0o(treeJNI2), (String) null, (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, treeJNI2.getDoubleValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE), 16372, 0, false));
            }
        }
        C1366783w A0G3 = C18250wR.A0G(features2, OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.StringFeatures.class, "string_features");
        while (A0G3.hasNext()) {
            TreeJNI treeJNI3 = (TreeJNI) A0G3.next();
            if (treeJNI3.hasFieldValue("id")) {
                A0y.put(C86134wK.A0o(treeJNI3), new FeatureData(Type.STRING, C86134wK.A0o(treeJNI3), treeJNI3.getStringValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE), (List) null, (List) null, (List) null, (List) null, (Map) null, (Map) null, (Map) null, (Map) null, 0.0d, 16364, 0, false));
            }
        }
        return A0y;
    }

    public final List A03(OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures onDeviceFlFeatures) {
        ArrayList A0v = AnonymousClass0wJ.A0v();
        if (onDeviceFlFeatures == null) {
            throw new AnonymousClass5F1("Got null FL feature response from server");
        } else if (onDeviceFlFeatures.getStringValue("usecase") == null || !onDeviceFlFeatures.hasFieldValue("time_stamp")) {
            throw new AnonymousClass5F1("Got invalid FL feature response from server");
        } else {
            C1366783w it = C18230wP.A0P(onDeviceFlFeatures, OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.class, "features").iterator();
            while (it.hasNext()) {
                OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features features = (OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features) it.next();
                String A0X = C18250wR.A0X(features);
                if (A0X != null) {
                    A0v.add(new Example(A00((OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.Context) features.getTreeValue("context", OnDeviceFLFeaturesResponseImpl.OnDeviceFlFeatures.Features.Context.class)), A0X, A01(features)));
                } else {
                    throw new AnonymousClass5F1("no example id");
                }
            }
            return A0v;
        }
    }
}
