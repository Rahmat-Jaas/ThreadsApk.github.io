package com.facebook.graphservice.tree;

import X.AnonymousClass00U;
import X.AnonymousClass0LU;
import X.AnonymousClass0qM;
import com.facebook.graphservice.asset.GraphServiceAsset;
import com.facebook.graphservice.interfaces.Tree;
import com.facebook.jni.HybridClassBase;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.Arrays;

public class TreeJNI extends HybridClassBase implements Tree {
    public static final Class TAG = TreeJNI.class;
    public final int[] mSetFields;
    public final int mTypeTag;

    public static native TreeJNI fromPando(GraphServiceAsset graphServiceAsset, com.facebook.pando.TreeJNI treeJNI, Class cls, long j, int i);

    private native ImmutableList getBooleanListNative(int i);

    private native boolean getBooleanValueNative(int i);

    private native ImmutableList getDoubleListNative(int i);

    private native double getDoubleValueNative(int i);

    private native ImmutableList getIntListNative(int i);

    private native int getIntValueNative(int i);

    private native ByteBuffer getStringAsNonOwningBufferNative(int i);

    private native ImmutableList getStringListNative(int i);

    private native String getStringNative(int i);

    private native String getStringNative(String str);

    private native ImmutableList getTimeListNative(int i);

    private native long getTimeValueNative(int i);

    private native TreeJNI[] getTreeArrayNative(int i, Class cls, int i2);

    private native TreeJNI[] getTreeArrayNative(String str, Class cls, int i);

    private native TreeJNI getTreeNative(int i, Class cls, int i2);

    private native TreeJNI getTreeNative(String str, Class cls, int i);

    public final native boolean fulfillsType(String str);

    public final native ImmutableList getAliases();

    public native Boolean getBooleanVariable(String str);

    public final native ImmutableList getCanonicals();

    public final native Tree.FieldType getFieldType(String str);

    public native String getFragmentHashes(GraphServiceAsset graphServiceAsset);

    public native String getTypeName();

    public final native boolean hasFieldValue(int i);

    public final native boolean hasFieldValue(String str);

    public final native boolean hasPrimaryKey();

    public native boolean isDeepEqual(TreeJNI treeJNI);

    public native Tree.DeepEqualGuess isDeepEqualBestGuess(TreeJNI treeJNI);

    public final native TreeJNI reinterpret(Class cls, int i);

    public native String toExpensiveHumanReadableDebugString();

    public native String toString();

    static {
        AnonymousClass0qM.A02("graphservice-jni-tree");
    }

    public static final TreeJNI[] filterNullArrayEntries(TreeJNI[] treeJNIArr) {
        if (treeJNIArr == null) {
            return null;
        }
        int i = 0;
        for (TreeJNI treeJNI : treeJNIArr) {
            if (treeJNI == null) {
                i++;
            }
        }
        if (i == 0) {
            return treeJNIArr;
        }
        TreeJNI[] treeJNIArr2 = new TreeJNI[(r5 - i)];
        int i2 = 0;
        for (TreeJNI treeJNI2 : treeJNIArr) {
            if (treeJNI2 != null) {
                treeJNIArr2[i2] = treeJNI2;
                i2++;
            }
        }
        return treeJNIArr2;
    }

    private boolean isFieldUnset(int i) {
        int[] iArr = this.mSetFields;
        if (iArr == null || Arrays.binarySearch(iArr, i) >= 0) {
            return false;
        }
        return true;
    }

    public final int getTypeTag() {
        return this.mTypeTag;
    }

    public TreeJNI(int i, int[] iArr) {
        this.mTypeTag = i;
        this.mSetFields = iArr;
        if (iArr != null) {
            Arrays.sort(iArr);
        }
    }

    private TreeJNI[] getTreeArray(String str, Class cls, int i) {
        if (isFieldUnset(str.hashCode()) || !isValidGraphServicesJNIModel()) {
            return null;
        }
        return filterNullArrayEntries(getTreeArrayNative(str, cls, i));
    }

    public final ImmutableList getBooleanList(int i) {
        if (isFieldUnset(i)) {
            return ImmutableList.of();
        }
        return getBooleanListNative(i);
    }

    public final boolean getBooleanValue(int i) {
        if (isFieldUnset(i)) {
            return false;
        }
        return getBooleanValueNative(i);
    }

    public final ImmutableList getDoubleList(int i) {
        if (isFieldUnset(i)) {
            return ImmutableList.of();
        }
        return getDoubleListNative(i);
    }

    public final double getDoubleValue(int i) {
        if (isFieldUnset(i)) {
            return 0.0d;
        }
        return getDoubleValueNative(i);
    }

    public final ImmutableList getIntList(int i) {
        if (isFieldUnset(i)) {
            return ImmutableList.of();
        }
        return getIntListNative(i);
    }

    public final int getIntValue(int i) {
        if (isFieldUnset(i)) {
            return 0;
        }
        return getIntValueNative(i);
    }

    public final String getString(int i) {
        if (isFieldUnset(i)) {
            return null;
        }
        return getStringNative(i);
    }

    public final ByteBuffer getStringAsNonOwningBuffer(int i) {
        if (isFieldUnset(i)) {
            return null;
        }
        return getStringAsNonOwningBufferNative(i);
    }

    public final ImmutableList getStringList(int i) {
        if (isFieldUnset(i)) {
            return ImmutableList.of();
        }
        return getStringListNative(i);
    }

    public final ImmutableList getTimeList(int i) {
        if (isFieldUnset(i)) {
            return ImmutableList.of();
        }
        return getTimeListNative(i);
    }

    public final long getTimeValue(int i) {
        if (isFieldUnset(i)) {
            return 0;
        }
        return getTimeValueNative(i);
    }

    public final TreeJNI getTree(String str, Class cls, int i) {
        if (isFieldUnset(str.hashCode())) {
            return null;
        }
        return getTreeNative(str, cls, i);
    }

    public final boolean isValidGraphServicesJNIModel() {
        return isValid();
    }

    public final boolean isValidGraphServicesJNIModelWithLogging() {
        boolean isValidGraphServicesJNIModel = isValidGraphServicesJNIModel();
        if (!isValidGraphServicesJNIModel) {
            AnonymousClass0LU.A0D("InvalidGraphServicesJNIModel", AnonymousClass00U.A0J("Invalid GraphServices JNI model with type tag: ", getTypeTag()));
        }
        return isValidGraphServicesJNIModel;
    }

    private TreeJNI[] getTreeArray(int i, Class cls, int i2) {
        if (isFieldUnset(i) || !isValidGraphServicesJNIModel()) {
            return null;
        }
        return filterNullArrayEntries(getTreeArrayNative(i, cls, i2));
    }

    public final TreeJNI getTree(int i, Class cls, int i2) {
        if (isFieldUnset(i)) {
            return null;
        }
        return getTreeNative(i, cls, i2);
    }
}
