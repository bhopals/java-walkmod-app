

## WalkMod 

	*A Open Source tool to fix java coding style issues.*
	
	- It inspect the whole code repository and instead of just reporting the coding issue, it corrects the code automatically based on set configuration rules.
	

### Installation

Installation of walkmod is quite easy.  Go to walkmod [homepage](http://walkmod.com), download and unzip the file and add the bin folder into your PATH environment variable.

**Thats all**

Now open command prompt and just type **walkmod**. the output should look like below screenshot.

<TO BE ATTACHED>



### Execution Modes
	
**Walkmod has two main execution modes:**
	
	**apply** - update/upgrade your code to resolve code conventions issues.
	**check** - Scan the traget directory and list out all the files that contain issues pertaining to declared ruleset.
	
	```
	walkmod apply
	
	walkmod check
	
	walkmod inspect sonar
	
	walkmod add -R sonar:DeclarationsShouldUseCollectionInterfaces
	
	```


### Types of code convention applied in current Project
	
	```
		 -  sonar:AddCurlyBrackets
	    -  sonar:AddSwitchDefaultCase
	    -  sonar:ArrayDesignatorOnType
	    -  sonar:CollapsibleIfStatements
	    -  sonar:DeclarationsShouldUseCollectionInterfaces
	    -  sonar:LocalVarsShouldComplyWithNamingConvention
	    -  sonar:PrimitiveInstantiationForToString
	    -  sonar:RedundantCastsShouldNotBeUsed
	    -  sonar:RemoveEmptyMethod
	    -  sonar:RemoveEmptyStatement
	    -  sonar:RemoveLiteralBoolean
	    -  sonar:RemoveUnusedMethodParameters
	    -  sonar:RemoveUselessImports
	    -  sonar:RemoveUselessParentheses
	    -  sonar:RemoveUselessVariables
	    -  sonar:StaticInitializedFieldToFinal
	    -  sonar:StringCheckOnLeft
	    -  sonar:UseCollectionIsEmpty
	    -  sonar:UseStringEquals
	    -  sonar:VariableImmediatelyReturned
	
		-  imports-cleaner
		-  dead-code-cleaner
		
		```
	
	
	
	
### WalkMod More Details...



[github Page](https://github.com/walkmod)

[Basic Usage](http://walkmod.com/docs#usage)

[Plugins](http://walkmod.com/docs#search_plugins)

[Quick Fixes](http://walkmod.com/docs#quickfixes)

[Integration](http://walkmod.com/docs#integration)

[Formatters](http://walkmod.com/docs#formatters)

[Installation Guide](http://walkmod.com/docs#installation)


	