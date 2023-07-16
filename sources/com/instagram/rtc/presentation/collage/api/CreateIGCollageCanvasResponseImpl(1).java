package com.instagram.rtc.presentation.collage.api;

import X.AnonymousClass0wJ;
import X.C108776iv;
import X.C81204nM;
import com.facebook.pando.TreeJNI;

public final class CreateIGCollageCanvasResponseImpl extends TreeJNI implements C81204nM {

    public final class IgCreateIncallCanvas extends TreeJNI implements C81204nM {

        public final class Canvas extends TreeJNI implements C81204nM {
            public final String[] getScalarFields() {
                return new String[]{"id"};
            }
        }

        public final C108776iv[] getEdgeFields() {
            return AnonymousClass0wJ.A1a(Canvas.class, "canvas");
        }
    }

    public final C108776iv[] getEdgeFields() {
        return AnonymousClass0wJ.A1a(IgCreateIncallCanvas.class, "ig_create_incall_canvas(data:$data)");
    }
}
