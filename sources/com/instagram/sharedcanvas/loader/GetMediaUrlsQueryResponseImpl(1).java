package com.instagram.sharedcanvas.loader;

import X.AnonymousClass000;
import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class GetMediaUrlsQueryResponseImpl extends TreeJNI implements C81204nM {

    public final class GetIgHangoutsCanvasUploadedMediaUrlsQuery extends TreeJNI implements C81204nM {
        public final String[] getScalarFields() {
            return new String[]{"cdn_url", "id"};
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1b(GetIgHangoutsCanvasUploadedMediaUrlsQuery.class, AnonymousClass000.A00(895));
    }
}
