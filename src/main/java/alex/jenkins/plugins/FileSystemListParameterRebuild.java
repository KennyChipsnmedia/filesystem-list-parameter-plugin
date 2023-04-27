package alex.jenkins.plugins;

import com.sonyericsson.rebuild.RebuildParameterPage;
import com.sonyericsson.rebuild.RebuildParameterProvider;
import hudson.Extension;
import hudson.model.ParameterDefinition;
import hudson.model.ParameterValue;

@Extension(optional = true)
public class FileSystemListParameterRebuild extends RebuildParameterProvider {

    /**
     * Changed by Kenny
     * @param definition
     * @param parameterValue
     * @return
     */
    @Override
    public RebuildParameterPage getRebuildPage(ParameterDefinition definition, ParameterValue parameterValue) {
        if (parameterValue instanceof FileSystemListParameterValue) {
            return new RebuildParameterPage(parameterValue.getClass(),"value.jelly", definition);
        }
        return null;
    }
}
