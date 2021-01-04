package com.study.designpattern.domain.service.engine;

import com.study.designpattern.domain.model.aggregates.TreeRich;
import com.study.designpattern.domain.model.vo.EngineResult;

import java.util.Map;

public interface IEngine {

    EngineResult process(final Long treeId, final String userId, TreeRich treeRich, final Map<String, String> decisionMatter);

}
