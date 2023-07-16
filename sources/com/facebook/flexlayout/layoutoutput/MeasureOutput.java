package com.facebook.flexlayout.layoutoutput;

import X.C18240wQ;

public class MeasureOutput {
    public float[] arr;
    public Object measureResult;

    public MeasureOutput(float f, float f2, float f3, Object obj) {
        float[] fArr = new float[C18240wQ.A1Z().length];
        this.arr = fArr;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = Float.NaN;
        this.measureResult = obj;
    }
}
