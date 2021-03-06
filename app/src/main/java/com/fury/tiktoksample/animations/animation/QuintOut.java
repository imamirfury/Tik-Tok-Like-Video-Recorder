package com.fury.tiktoksample.animations.animation;

import android.animation.TimeInterpolator;

/**
 * Created by danielzeller on 09.04.15.
 */
public class QuintOut implements TimeInterpolator {
    @Override
    public float getInterpolation(float t) {
        return (t -= 1) * t * t * t * t + 1;
    }
}