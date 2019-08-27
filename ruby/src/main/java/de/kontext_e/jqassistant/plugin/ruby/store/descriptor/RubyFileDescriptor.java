package de.kontext_e.jqassistant.plugin.ruby.store.descriptor;

import com.buschmais.jqassistant.plugin.common.api.model.FileDescriptor;
import com.buschmais.jqassistant.plugin.common.api.model.NamedDescriptor;
import com.buschmais.xo.neo4j.api.annotation.Relation;

import java.util.List;
import java.util.Set;

public interface RubyFileDescriptor extends RubyDescriptor, NamedDescriptor, FileDescriptor, ConstantContainer,
        MethodContainer {

    @Relation("CONTAINS")
    Set<ClassDescriptor> getClasses();

    @Relation("CONTAINS")
    Set<ModuleDescriptor> getModules();

    @Relation("REQUIRES")
    List<RequireDescriptor> getRequires();
}
