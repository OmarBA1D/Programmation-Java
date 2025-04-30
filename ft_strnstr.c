/* ************************************************************************** */
/*                                                                            */
/*                                                        :::      ::::::::   */
/*   ft_strnstr.c                                       :+:      :+:    :+:   */
/*                                                    +:+ +:+         +:+     */
/*   By: ombouarg <marvin@42.fr>                    +#+  +:+       +#+        */
/*                                                +#+#+#+#+#+   +#+           */
/*   Created: 2025/04/23 17:53:22 by ombouarg          #+#    #+#             */
/*   Updated: 2025/04/23 18:09:36 by ombouarg         ###   ########.fr       */
/*                                                                            */
/* ************************************************************************** */

#include <string.h>
#include <stdio.h>

char	*ft_strnstr(const char *big, const char *little, size_t len)
{
	size_t	i;
	size_t	j;

	if (*little == '\0')
		return ((char *)big);
	i = 0;
	while (big[i] != '\0' && i < len)
	{
		j = 0;
		while (big[i + j] == little[j] && (i + j) < len)
		{
			if (little[j + 1] == '\0')
				return ((char *)&big[i]);
			j++;
		}
		i++;
	}
	return (NULL);
}
/*
int	main(void)
{
	char	*str;
	char	*find;
	char	*result;

	str = "Hola mundo, bienvenidos a 42";
	
	find = "mundo";
	result = ft_strnstr(str, find, strlen(str));
	printf("Buscando '%s' en '%s':\n", find, str);
	if (result)
		printf("Resultado: %s\n", result);
	else
		printf("Resultado: NULL\n");

	find = "adios";
	result = ft_strnstr(str, find, strlen(str));
	printf("\nBuscando '%s' en '%s':\n", find, str);
	if (result)
		printf("Resultado: %s\n", result);
	else
		printf("Resultado: NULL\n");

	find = "";
	result = ft_strnstr(str, find, strlen(str));
	printf("\nBuscando 'cadena vacía' en '%s':\n", str);
	if (result)
		printf("Resultado: %s\n", result);
	else
		printf("Resultado: NULL\n");

	find = "bienvenidos";
	result = ft_strnstr(str, find, 15);
	printf("\nBuscando '%s' en primeros 15 chars de '%s':\n", find, str);
	if (result)
		printf("Resultado: %s\n", result);
	else
		printf("Resultado: NULL\n");

	return (0);
}*/
