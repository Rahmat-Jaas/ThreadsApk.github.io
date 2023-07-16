package com.facebook.papaya.client.engine.impl;

import X.AnonymousClass0LU;
import X.AnonymousClass0wJ;
import X.C04220Ms;
import X.C15020qa;
import X.C18180wK;
import X.C18200wM;
import X.C18230wP;
import android.content.Context;
import android.os.Bundle;
import com.facebook.papaya.client.engine.IEngineFactory;
import com.facebook.papaya.client.executor.IExecutorFactory;
import com.facebook.papaya.client.model_loader.IModelLoader;
import com.facebook.papaya.client.transport.ITransport;
import com.facebook.papaya.client.type.PapayaRestrictions;
import com.google.common.collect.ImmutableMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class EngineFactory extends IEngineFactory {
    private final native void initHybrid(ITransport iTransport, Map map, Map map2, IModelLoader iModelLoader);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EngineFactory(Context context, Map map, Bundle bundle, Map map2, List list, ITransport iTransport, IModelLoader iModelLoader) {
        super(context);
        AnonymousClass0wJ.A1O(context, map);
        AnonymousClass0wJ.A1R(bundle, map2);
        C18230wP.A1R(list, 5, iTransport);
        C15020qa.A0A("papaya-engine");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C15020qa.A0B(C18180wK.A0k(it), 16);
        }
        HashMap A0y = AnonymousClass0wJ.A0y();
        Iterator A0z = AnonymousClass0wJ.A0z(map2);
        while (A0z.hasNext()) {
            Map.Entry A0o = C18180wK.A0o(A0z);
            A0y.put(A0o.getKey(), ((PapayaRestrictions) A0o.getValue()).A00());
        }
        ImmutableMap.Builder builder = new ImmutableMap.Builder();
        Iterator A0z2 = AnonymousClass0wJ.A0z(map);
        while (A0z2.hasNext()) {
            Map.Entry A0o2 = C18180wK.A0o(A0z2);
            String A0p = C18200wM.A0p(A0o2);
            try {
                builder.put(A0p, (IExecutorFactory) ((Class) A0o2.getValue()).getConstructor(new Class[]{Context.class, Bundle.class}).newInstance(new Object[]{context, bundle.getBundle(A0p)}));
            } catch (Exception e) {
                AnonymousClass0LU.A0F("PapayaEngineFactory", "Failed to instantiate ExecutorFactory implementation", e);
            }
        }
        ImmutableMap build = builder.build();
        C04220Ms.A06(build);
        initHybrid(iTransport, build, A0y, iModelLoader);
    }
}
