/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strrchr.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/23 16:26:11 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/23 16:53:29 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <string.h>
#include <stdio.h>

char	*ft_strrchr(const char *s, int c)
{
	char	*ult_ocurrencia;
	char	actual;

	ult_ocurrencia = NULL;
	while (*s)
	{
		actual = *s;
		if (actual == (char)c)
		{
			ult_ocurrencia = (char *)s;
		}
		s++;
	}
	if ((char)c == '\0')
	{
		return ((char *)s);
	}
	return (ult_ocurrencia);
}
/*
int	main(void)
{
	const char	*texto = "hola, Copain";
	char		*resultado;

	resultado = strrchr(texto, 'a');
	if (resultado)
	{
		printf("Encontrado: %s\n", resultado);
	}
	else
		printf("No encontrado\n");
	return (0);
}*/
