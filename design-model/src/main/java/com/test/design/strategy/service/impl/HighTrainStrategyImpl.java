package com.test.design.strategy.service.impl;

import com.test.design.strategy.service.TravelStrategy;

/**
 * @author shanqi
 * @projectName: design-model
 * @packageName: com.test.design.strategy.service.impl
 * @name: TrainStrategyImpl
 * @date 2020/7/3
 */
public class TrainStrategyImpl implements TravelStrategy {
    @Override
    public void travelStyle() {

        System.out.println("乘坐火车。。。");
    }
}
