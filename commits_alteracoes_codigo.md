# Atualizando o código
	
	$ git pull origin master

	> Assim, você estará atualizando seu código com a última versão que está dentro do repositório.

	> Faça isso antes de começar as alterações do seu código e antes de de enviar para o repositório


# Comitando seu código
	
### Adicionar suas alterações ao código

	$ git add <nome_do_arquivo_alterado>

	> Obs: Tente sempre fazer alterações pontuais e não alterações giga enormes

	> Se quiser ter certeza que foram as modificações use:

		$ git status

### Realizando commit

	> Sugiro que tente atualizar novamente seu código, no meio tempo que você estava alterando, alguém pode já ter feitos alterações e subido para o rep.

		$ git pull origin master

	> Há duas maneiras de se fazer

		$ git commit

	>> Aqui no qual irá abrir um editor de texto via terminal, seja nano, vim ou vi.

	> Ou uma segunda opções que você já passa a mensagem junto 

		$ git commit -m 'Mensagem entre aspas simples ou duplas'


# Enviando seu código para o repositório

	$ git push origin master


# Adicionais

	> Ok, fiz merda e enviei um código faltando algumas partes

	> Tudo bem, adicione o que estava faltando mesmo que o restante que já foi enviaod não esteja lá e faça um outro commit, porém da seguinte forma:

		$ git commit --amend

	> Obs: esse parametro --amend ajuda a editar novamente o seu último commit, então não será criado um novo commit, mas sim somente alterado aquele que você já havia enviado. A única mudança é que o seu novo commit terá um novo hash.


	> Obs2: CASO isso ocorra, na hora de realizar um "git push", vai ser necessário forçá-lo, pois já haverá um commit anterior a esse:

		$ git push origin master -f



